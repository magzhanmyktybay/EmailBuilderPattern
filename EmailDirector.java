public class EmailDirector {

    public void makeWelcomeEmail(EmailBuilder builder) {
        builder
                .setFrom("company@example.com")
                .setTo("student@example.com")
                .setSubject("Welcome to our platform")
                .setBody("Thank you for joining us!");
    }

    public void makePasswordResetEmail(EmailBuilder builder) {
        builder
                .setFrom("security@example.com")
                .setTo("student@example.com")
                .setSubject("Password Reset")
                .setBody("Click the link to reset your password.");
    }
}