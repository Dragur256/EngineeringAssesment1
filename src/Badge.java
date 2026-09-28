import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Badge {
    private String name;
    private int idNumber;
    private int accessCategory; // 0 - Visitor | 1 - Student | 2 - Staff
    private String issuedBy;

    // Getters
    public String getName(){
        return name;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public int getAccessCategory(){
        return accessCategory;
    }
    public String getIssuedBy(){
        return issuedBy;
    }

    // Setters
    public void setName(String name){
        if(name.isEmpty()||name==null){
            System.out.println("Name must not be empty");
        }
        else {
            this.name = name;
        }
    }
    public void setIdNumber(int idNumber){
        if(idNumber<0){
            System.out.println("ID number must be positive");
        }
        else{
            this.idNumber=idNumber;
        }
    }
    public void setAccessCategory(int accessCategory){
        if(accessCategory<0||accessCategory>2){
            System.out.println("Access category out of bounds (0-2)");
        }
        else{
            this.accessCategory=accessCategory;
        }
    }
    public void setIssuedBy(String issuedBy){
        if(issuedBy.isEmpty()||issuedBy==null){
            System.out.println("Issuing Officer must not be empty");
        }
        else{
            this.issuedBy=issuedBy;
        }
    }

    public void getInformation(){ // User input for creating a new badge
        InputStreamReader inputStreamReader=new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        try{
            System.out.print("Enter visitor name: ");
            setName(bufferedReader.readLine());
            System.out.print("Enter visitor ID: ");
            setIdNumber(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Enter access category: ");
            setAccessCategory(Integer.parseInt(bufferedReader.readLine()));
            System.out.print("Enter name of issuing officer: ");
            setIssuedBy(bufferedReader.readLine());
        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printBadge(){ // Prints badge information (name, id number, access level, issuing officer)
        System.out.println("Name: "+name);
        //System.out.println("Badge ID: "+idNumber); // Doesn't say to print ID
        System.out.print("Access level: ");
        if(accessCategory==0){
            System.out.println("Visitor - Temporary Access");
        }
        else if(accessCategory==1){
            System.out.println("Student - Limited Access");
        }
        else{
            System.out.println("Staff - Full Access");
        }
        System.out.println("Issued by: Officer "+issuedBy);
    }
}
