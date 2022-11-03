// Κλάση για την υλοποίηση στοίβας με πίνακα
// Τα στοιχεία είναι ακέραιοι 

class ArrayStack
   {
   private int maxSize;        // μέγιστο μέγεθος
   private char[] dataArray;    // δεδομένα 
   private int top;            // κορυφή
   
   // κατασκευαστής
   public ArrayStack(int s)     
      {
      maxSize = s;            
      dataArray = new char [maxSize];  
      top = -1;                
      }
   
   // elegxos gia keni stoiva
   public boolean isEmpty()    
      {
      return (top == -1);
      }
   
   // elegxos gia pliri stoiva
   public boolean isFull()     
      {
      return (top == maxSize-1);
      }      

   // push
   public void push(char j) throws Overflow   
      {
       if( isFull( ) ) throw new Overflow("Stack is Full");
       dataArray[++top] = j; 
      }
   
   // pop
   public char pop() throws Underflow   
      {
       if( isEmpty( ) ) throw new Underflow("Stack is Empty");   
       return dataArray[top--];  
      }

   // stoixeio korufis tis stoivas
   public char peek()   
      {
       return dataArray[top];
      }
   // thesi korufaiou stoixeiou tis stoivas  
   public int top(){
        return top;
    }
   } 