public class EmailObjectBuilder implements EmailBuilder {
    private String from, to, subject, body;
    public EmailObjectBuilder setFrom(String from) { this.from = from; return this; }
    public EmailObjectBuilder setTo(String to) { this.to = to; return this; }
    public EmailObjectBuilder setSubject(String subject) { this.subject = subject; return this; }
    public EmailObjectBuilder setBody(String body) { this.body = body; return this; }
    public Email getResult() {
        if (from == null || to == null || subject == null || body == null)
            throw new IllegalStateException("To, from, subject and body are required");
        return new Email(from, to, subject, body);
    }
}
