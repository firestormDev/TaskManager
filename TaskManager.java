import java.util.Scanner;
import java.util.ArrayList;/**
 *
 * @author luizg
 */
public class Main2 {   
   public static void main(String[] args) {
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.println("                          »» Bem vindo ao Task Manager do Luiz ««                                                     ");          
        System.out.println("    ");
        
        Scanner n = new Scanner(System.in);  
        String tarefa = n.next();       
    	int next = 1;
    
    
    while (next != 2){
       System.out.println("  ");    
       System.out.println("Digite a opção desejada ");
       System.out.println(" 1 - Inicio, 2 - Sair");
       next = n.nextInt();
       if( next == 2){
         System.exit(0);                
            }       
       int opMenu = n.nextInt();            
       System.out.println("--------------------------------------------------------------------------------------------------------------");   
            
    switch(opMenu){
        case 1 :
            int res = 0;            
            System.out.println("--------------------------------------------------------------------------------------------------------------"); 
            System.out.println("Escolha uma opção: ");
            System.out.println(" 1 - Add Task |   2 - Exit | 3 - Remove Task | 4- Ver Task");
            System.out.println(" Opção: ");        
            int opMenu2 = n.nextInt();            
        
             switch(opMenu2){
                   case 1 :                        
                        System.out.println("Digite a nova Task ");
			String Task = n.nextLine();
			task.add(newTask);                      
                        }

                    break;
                        
                  case 2 :{
                       System.out.println("TaskManager destinado para estudo de Java");            
                       System.out.println("Obrigado por usar!");               	
                       System.out.println("--------------------------------------------------------------------------------------------------------------");   
                       System.exit(0); 
			} 
		    break;    
		
                  case 3: {
                          for(int i = 0; i < task.size(); i++) {
                             Task t = task.get(i);
                             if(t.getTask().equals(Task)){ 
                               task.remove(t);
                               break;
                             }
                          }

	 	        }
		   break;

		   case 4: {
			  System.out.print("Task cadastradas:\n");
                          for(int i = 0; i < task.size(); i++) {System.out.print(task.get(i).getTask() + "\n"); }
		        }
       
                 
                default :
                    System.out.println(" você inseriu uma opção inválida");
                break;
               }                  
            
    }  	
}
