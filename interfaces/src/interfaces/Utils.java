package interfaces;

public class Utils {
       public static void runLoggers(Logger[] loggers,String messsage){
    	   for (Logger logger : loggers) {
   			logger.log(messsage);
   		}
       }
       
}
