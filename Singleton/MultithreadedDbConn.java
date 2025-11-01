public class MultithreadedDbConn {
    private static MultithreadedDbConn obj = null;
    private MultithreadedDbConn(){}
    public static MultithreadedDbConn getInstance(){
        if(obj == null){
            synchronized(MultithreadedDbConn.class){
                if(obj == null){
                    obj = new MultithreadedDbConn();
                }
            }
        }
        return obj;
    }
}
