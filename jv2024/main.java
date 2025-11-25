public class main {
    public static void main(String[] args) {
        Content[] initialContent = new Content[10];
        Utilisateurs[] initialUsers = new Utilisateurs[10];
        StreamingPlatform platform = new StreamingPlatform(initialContent, initialUsers);
        
        Movie movie1 = new Movie("Inception", "Sci-Fi", false, 148);
        Movie movie2 = new Movie("Charlie Chaplin", "Comedy", true, 75);
        Serie serie1 = new Serie("Stranger Things", "Thriller", false, 25, 50);
        Serie serie2 = new Serie("Friends", "Comedy", true, 236, 22);
        
        platform.addContent(movie1);
        platform.addContent(movie2);
        platform.addContent(serie1);
        platform.addContent(serie2);
        

        movie1.afficheDetails();
        movie2.afficheDetails();
        serie1.afficheDetails();
        serie2.afficheDetails();
        System.out.println();
        

        Utilisateurs user1 = new Utilisateurs("Imene");  
        Utilisateurs user2 = new Utilisateurs("Jihene");
        user2.isSubscribed = true; 
        
        platform.addUtilisateur(user1);
        platform.addUtilisateur(user2);
        
        platform.playContent(user1, "Inception");
        platform.playContent(user1, "Charlie Chaplin");
        System.out.println();
        
        platform.playContent(user2, "Stranger Things");
        platform.playContent(user2, "Friends");
        System.out.println();
        
        Content[] recommendations = platform.getRecommendations(user2);
        for (Content recommendation : recommendations) {
            if (recommendation != null) {
                recommendation.afficheDetails();
            }
        }
    }
}