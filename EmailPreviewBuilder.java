public class EmailPreviewBuilder implements EmailBuilder {
    private final StringBuilder sb =
            new StringBuilder("=== Email Preview ===\n");
    @Override
    public EmailPreviewBuilder setFrom(String from) {
        sb.append("From: ")
                .append(from)
                .append("\n");
        return this;
    }
    @Override
    public EmailPreviewBuilder setTo(String to) {
        sb.append("To: ")
                .append(to)
                .append("\n");
        return this;
    }
    @Override
    public EmailPreviewBuilder setSubject(String subject) {
        sb.append("Subject: ")
                .append(subject)
                .append("\n");
        return this;
    }
    @Override
    public EmailPreviewBuilder setBody(String body) {
        sb.append("Body: ")
                .append(body)
                .append("\n");
        return this;
    }
    public String getResult() {
        return sb.toString();
    }
}

