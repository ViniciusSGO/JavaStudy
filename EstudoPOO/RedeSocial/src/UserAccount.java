public class UserAccount {
    private final int TIMELINE_SIZE = 10;
    private final int INFINITY = 100;
    private String username;
    private final String email;
    private final Post[] posts = new Post[INFINITY];
    private final Post[] timeline = new Post[TIMELINE_SIZE];
    private final UserAccount[] followers = new UserAccount[INFINITY];

    private int numberOfPosts;
    private int numberOfFollowers;
    private int numberOfPostsinTimeline;

    public UserAccount(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }
    public void publish(String quote){
        final Post post = new Post(quote,this);
        posts[numberOfPosts++] = post;
        for (int i = 0; i < numberOfFollowers; i++) {
            followers[i].updateTimeLine(post);
        }
    }
    public void updateTimeLine(Post post){
        final int position = numberOfPostsinTimeline % TIMELINE_SIZE;
        timeline[position] = post;
        numberOfPostsinTimeline++;
    }
    public void removePost(int index){
        if (index == 0 && numberOfPosts == 1){
            posts[--numberOfPosts] = null;
            return;
        }
        if (index<0 || index >= numberOfPosts)
            return;
        for (int i = index; i < numberOfPosts-1 ; i++) {
            posts[i] = posts[i+1];
        posts[numberOfPosts--] = null;
        }
    }
    public void acceptFollower(UserAccount follower){
        followers[numberOfFollowers++] = follower;
    }
    public void blockFollower(UserAccount follower){
        for (int i = 0; i < numberOfFollowers; i++) {
            if (followers[i]==follower){
                for (int j = 0; j < numberOfFollowers-1; j++) {
                    followers[j] = followers[j+1];
                }
                followers[numberOfFollowers--] = null;
            }

        }
    }

    public void clapPost(int index){
        if(index<0 || index>= timelineIndexLimit())return;
        timeline[index].clap();
    }
    public void booPost(int index){
        if(index<0 || index>= timelineIndexLimit())return;
        timeline[index].boo();
    }
    public String getFollowersAsString(){
        String result = "";
        for (int i = 0; i < numberOfFollowers; i++) {
            result += followers[i].getUsername() + "\n";
        }
        return result;
    }
    public String getPostsAsString(){
        String result = "";
        for (int i = 0; i < numberOfPosts; i++) {
            result += posts[i].postToString() + "\n";
        }
        return result;
    }
    public String getTimelineAsString(){
        String result = "";
        for (int i = 0; i < numberOfPostsinTimeline; i++) {
            result += timeline[i].postToString() + "\n";
        }
        return result;
    }

    private int timelineIndexLimit(){
        return Math.min(numberOfPostsinTimeline,TIMELINE_SIZE);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
}
