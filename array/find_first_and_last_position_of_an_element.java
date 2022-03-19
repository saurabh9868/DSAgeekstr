package DsaGeekster.array;

public class find_first_and_last_position_of_an_element {
    public static void main(String[] args) {
        int num[]={1,2,8,4,8,5,6,8,9};
        int n=8;

        int pos1=-1;
        boolean ispresent=false;
        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                ispresent=true;
                pos1=i;
                break;
            }
        }
        boolean ispresent2=false;
        int pos2=-1;

        for (int i = 0; i < num.length; i++) {
            if(num[i]==n){
                ispresent2=true;
                pos2=i;
            }
        }
        if(ispresent||ispresent2){
            System.out.println("number first come at "+pos1+" position then at last it comes at "+pos2+" position");
        }
        else{
            System.out.println("not present");
        }
    }
}
