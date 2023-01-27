/*
 * Create a class even that has the following properties:
 * 1- one private integer member that has to be even at all times
 * 2- getter
 * 3- setter: the private memeber should be set the input if the input is even, if not then it should be set to 
 * the input + 1.
 * 4- default constructor that sets num to 0
 * 5- constructor that sets num to specific number, if the number is odd then increase by one.
 * 6- method print to display the number
 * 7. method add that accepts an integer and adds the int to num (if the result is odd then add one).
 * 8. same for subtract.
 * 9. print to show num.
 * 10. EXTRA: method add that accepts an even object and adds the num of the object to num. 
 * 11. Write a tester to test your class (all methods).
 */

//testing 

public class Even {

     
	private int num; //1- one private integer member that has to be even at all times
    
	public int getNum() {  // 2- getter of num
       	return num;
    }
        
    public void setNum(int num) {   // 3- setter: the private memeber should be set the input if the input is even,
                                    //if not then it should be set to the input + 1.
        if(num%2==1) {
            this.num = num + 1; //num++;
            
        } else {
             this.num = num;
        }
    }
    
    public Even() {//4- default constructor that sets num to 0
        setNum(0);
     }
    
    public Even(int n) { //5- constructor that sets num to specific number, if the number is odd then increase by one.
        //use the setter 
    	this.setNum(n);
    
    }
        
    //8. same for subtract.
    public void subtract(int n) {
    	this.setNum(this.num - n);
    }
    
    //we always override toString()
    public String toString() {
    	String st = "Num: " + num;
    	return st;
    }
    
    public void print() {
    	System.out.println(this.toString());
    }
    
    //equals will accept an object of the same class and return true if this object and the input object 
    //are the same and false if not. 
    public boolean equals(Even E) {
    	//here we have two objects one is E and the other is this 
    	if(this.num == E.num)
    		return true;
    	else
    		return false; 
    }
    // method add that accepts an integer and adds the int to num (if the result is odd then add one).
    
    public void add(int n) {
    	this.setNum(this.num +n);
    }
    //Overloading
    //10. EXTRA: method add that accepts an even object and adds the num of the object to num. 
    public void add(Even E) {
    	this.num = E.getNum()+this.num;                                                        
    	
    }
    
    /*
    * 11. Write a tester to test your class (all methods).
    */
    
    }




