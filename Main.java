public class Main {

    public static void main(String[] args) {

        EmailDirector director = new EmailDirector();

        EmailObjectBuilder objectBuilder = new EmailObjectBuilder();

        director.makeWelcomeEmail(objectBuilder);

        Email welcomeEmail = objectBuilder.getResult();

        System.out.println("EMAIL OBJECT:");
        System.out.println(welcomeEmail);
        System.out.println();

        EmailPreviewBuilder previewBuilder = new EmailPreviewBuilder();

        director.makeWelcomeEmail(previewBuilder);

        String welcomePreview = previewBuilder.getResult();

        System.out.println("EMAIL PREVIEW:");
        System.out.println(welcomePreview);
    }
}