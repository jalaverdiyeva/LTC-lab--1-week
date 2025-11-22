public class NetflixLoginLogic {
    public static void main(String[] args){
        boolean isLoggedIn, hasSubscription, canWatchContent, isAccountActive;
        isLoggedIn=true; hasSubscription=false;

        System.out.println("Scenario: User is logged in but has no active subscription.");
        System.out.println("isLoggedIn = " + isLoggedIn);
        System.out.println("hasSubscription = " + hasSubscription);
        System.out.println("--------------------------👾--------------------------");

        // 1. Can the user watch content? (Requires BOTH conditions to be true)
        canWatchContent = isLoggedIn && hasSubscription;
        System.out.println("Can user watch content? (isLoggedIn AND hasSubscription): " + canWatchContent);

        // 2. Is the account generally considered active? (Requires AT LEAST ONE condition to be true)
        isAccountActive = isLoggedIn || hasSubscription;
        System.out.println("Is the account considered active? (isLoggedIn OR hasSubscription): " + isAccountActive);
    }
}
