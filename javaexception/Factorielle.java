class Factorielle {

    public static void main(String[] args) {
       
         
            
            int nbEntiers = 0;
            
            try {
                nbEntiers = Integer.parseInt(args[0]);
                
                if (nbEntiers < 0) {
                    throw new nbNEX(nbEntiers);
                }
                
                if (nbEntiers >= 20) {
                    throw new nbGrandEX(nbEntiers);
                }
                
            } catch (NumberFormatException | nbNEX e) {
              e.getMessage();
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Veuillez fournir un entier en argument");
                return;
            }
            catch (nbGrandEX e) {
                System.out.println(e.getMessage());
                return;
            }
            
            int i, factorielle = 1;
            for (i = 2; i <= nbEntiers; i++) {
                factorielle *= i;
            }
            
            System.out.println("Voila la factorielle des " + nbEntiers
                    + " premiers entiers : " + factorielle);
                    
    }
}