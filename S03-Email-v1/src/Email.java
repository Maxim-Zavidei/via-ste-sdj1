public class Email {

    private String user;
    private String host;
    private String domain;

    public Email(String user, String host, String domain) {
        this.user = user;
        this.host = host;
        this.domain = domain;
    }

    public String getUser() {
        return this.user;
    }

    public String getHost() {
        return this.host;
    }

    public String getDomain() {
        return this.domain;
    }

    @Override
    public String toString() {
        return this.user + "@" + this.host + "." + this.domain;
    }
}
