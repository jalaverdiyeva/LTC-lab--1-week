public class InstagramFilterAI {
    public static void main(String[] args) {
        int brightness=10;int contrast=53;
        String filterName="Doja Dod";
        boolean isPremium=true;

        System.out.println("Initial Contrast: "+contrast);

        if (isPremium) {
            System.out.println("Premium filter detected. Applying enhancement...");
            contrast+=20;
        }

        System.out.println("\n--- Final Filter Details ---");
        System.out.println("Applied Filter: "+filterName);
        System.out.println("Brightness Level: "+brightness);
        System.out.println("Contrast Level: "+contrast);
        System.out.println("Is Premium User?: "+isPremium);
    }
}
