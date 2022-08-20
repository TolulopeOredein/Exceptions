public class Exceptions {
    void computeSalary() throws Exception{
        throw new Exception(" This is an exception");
    }

    void tryCatchBlock(){
        try{
            computeSalary();
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
