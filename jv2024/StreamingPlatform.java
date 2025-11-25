public class StreamingPlatform {
    private Content[] contentList;
    private Utilisateurs[] utilisateursList;
    private int nbContent;
    private int nbUtilisateurs;

    public StreamingPlatform(Content[] contentList, Utilisateurs[] utilisateursList) {
        this.contentList = contentList;
        this.utilisateursList = utilisateursList;
        this.nbContent = 0;  
        this.nbUtilisateurs = 0;  
    }

    public void addContent(Content content) {
        if (this.nbContent < contentList.length) {
            this.contentList[this.nbContent] = content;
            this.nbContent++;
        }
    }

    public void addUtilisateur(Utilisateurs utilisateur) {
        if (this.nbUtilisateurs < utilisateursList.length) {
            this.utilisateursList[this.nbUtilisateurs] = utilisateur;
            this.nbUtilisateurs++;
        }
    }

    public Content[] findContent(String title) {
        Content[] result = new Content[this.nbContent];
        int nbc = 0;
        for (int i = 0; i < this.nbContent; i++) {
            if (this.contentList[i] != null && this.contentList[i].title.equals(title)) {
                result[nbc] = this.contentList[i];
                nbc++;
            }
        }
        return result;
    }

    public void playContent(Utilisateurs user, String title){
        Content[] foundContent = findContent(title);
        if (foundContent.length > 0 && foundContent[0] != null) {
            Content content = foundContent[0];
            if (user.canPlay(content)){
                content.play();
            }
            else {
                System.out.println("no");
            }
        } else {
            System.out.println("Content not found: " + title);
        }
    }

    public Content[] getRecommendations(Utilisateurs user) {
        Content[] recommendations = new Content[10];
        int recCount = 0;
        String[] watchedGenres = user.getWatchedGenres();
        
        for (int i = 0; i < nbContent && recCount < 10; i++) {
            Content content = contentList[i];
            
            boolean hasWatched = false;
            for (int j = 0; j < user.getNbWatched(); j++) {
                if (user.getWatchedContent()[j] == content) {
                    hasWatched = true;
                    break;
                }
            }
            
            if (!hasWatched) {
                for (String genre : watchedGenres) {
                    if (genre != null && content.genre.equals(genre)) {
                        recommendations[recCount] = content;
                        recCount++;
                        break;
                    }
                }
            }
        }
        return recommendations;
    }
}