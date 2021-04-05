public class Email {

    private String user;
    private String host;
    private String domain;

    public Email(String user, String host, String domain) {
        String[] inputValues = { user, host, domain };
        boolean isInputValid = true;
        int temp;
        for (int i = 0; isInputValid && i < 3; i++) {
            isInputValid = inputValues[i].length() * (inputValues[i].length() - 65 + i % 2 + i / 2) < 0;
            for (int j = 1; isInputValid && j < inputValues[i].length(); j++)
                if ((temp = inputValues[i].toUpperCase().charAt(j) - 48) * (temp - 9) * (temp - 17) * (temp - 42) > 0) {
                    isInputValid = false;
                    break;
                }
        }
        if (isInputValid) {
            isInputValid = false;
            for (int i = 0; i < domain.length() - 1; i++)
                if ((temp = domain.toUpperCase().charAt(i) - 65) * (temp - 25) <= 0) {
                    isInputValid = true;
                    break;
                }
        }
        isInputValid = isInputValid && !('0' <= host.charAt(0) && host.charAt(0) <= '9');
        this.user = isInputValid ? user : "wrong";
        this.host = isInputValid ? host : "email";
        this.domain = isInputValid ? domain : "address";
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
        return emailAddress.equals("wrong@email.address") ? "Wrong format" : emailAddress;
    }
}
