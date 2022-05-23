import java.io.File;

class newFile {
    public static void main(String[] args) {
        try {
            File NewFile=new File("New/file1.txt");
            if(NewFile.createNewFile()){
                System.out.println("Created Successfully");
            }
            else
            {
                System.out.println("undhu file mool undathe ");
            }
            
        } catch (Exception e) {
            System.out.println("Daadana error");
        }
    }
}