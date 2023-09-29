import java.time.LocalDateTime;

public class Post {
    private String quote;
    private LocalDateTime timestamp;
    private int boos;
    private int claps;
    private final UserAccount account;

    public Post(String quote, UserAccount account) {
        this.quote = quote;
        this.account = account;
        this.timestamp = LocalDateTime.now();
    }
    public String postToString(){
        return String.format("[%s] %s says \"%s\" | Claps: %d | Boos: %d ",
                timestamp.toString(),account.getUsername(),quote,claps,boos);
    }
    public void clap(){
        claps++;
    }
    public void boo(){
        boos++;
    }

    public String getQuote() {
        return quote;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public int getBoos() {
        return boos;
    }

    public int getClaps() {
        return claps;
    }
}
