public class Email {

    private String user;
    private String host;
    private String domain;

    public Email(String user, String host, String domain) {
        if (isLegal(user, host, domain)) {
            this.user = user;
            this.host = host;
            this.domain = domain;
        } else {
            this.user = "wrong";
            this.host = "email";
            this.domain = "address";
        }
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
        String emailAddress = this.user + "@" + this.host + "." + this.domain;
        return isLegal(user, host, domain) ? emailAddress : "Wrong format";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Email)) return false;
        Email other = (Email) obj;
        return user.equals(other.user) && host.equals(other.host) && domain.equals(other.domain);
    }

    public static boolean isLegal(String user, String host, String domain) {
        String[] inputValues = {user, host, domain};
        boolean isInputValid = true;
        int temp;
        for (int i = 0; isInputValid && i < 3; i++) {
            isInputValid = inputValues[i].length() * (inputValues[i].length() - 65 + i % 2 + i / 2) < 0;
            for (int j = 1; isInputValid && j < inputValues[i].length(); j++) if ((temp = inputValues[i].toUpperCase().charAt(j) - 48) * (temp - 9) * (temp - 17) * (temp - 42) > 0) {
                isInputValid = false;
                break;
            }
        }
        if (isInputValid) {
            isInputValid = false;
            for (int i = 0; i < domain.length() - 1; i++) if ((temp = domain.toUpperCase().charAt(i) - 65) * (temp - 25) <= 0) {
                isInputValid = true;
                break;
            }
        }
        return isInputValid && !('0' <= host.charAt(0) && host.charAt(0) <= '9');
    }
}
