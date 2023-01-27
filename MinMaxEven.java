/*
 * Design and implement  class MinMaxEven that has the following:
 * - 2 integer member variables that are even at all time. Use the class Even. 
 * - all the rest of the methods of MinMax. 
 * 
 */
public class MinMaxEven {
	Even min, max;
	
	   public int getMin(){
	        return min.getNum();
	    }
	    public int getMax(){
	        return max.getNum();

	    }
	    public  void setMinMax(int min, int max){
	        if(max > min){
	            this.max.setNum(max);
	            this.min.setNum(min);
	        }else {
	            this.max.setNum(min);
	            this.min.setNum(max);
	        }
	        
	    }
	    
	    public MinMaxEven(){
	        //we create them first. 
	    	this.min = new Even(0);
	    	this.max = new Even(0);

	    }
	    public MinMaxEven(int min, int max){
	    	this.min = new Even(0);
	    	this.max = new Even(0);
	        this.setMinMax(min, max);    
	    }
	    public String toString(){
	        String s1= "Minimum value: " + min.toString() + " Maximum value: " + max.toString();
	        return s1;
	    }
	    public void add(int num){
	        this.min.setNum(this.min.getNum() + num);
	        this.max.setNum(this.max.getNum() + num);
	    }
	    public void multiply(int n){
	    	this.setMinMax(this.getMin()*n, this.getMax()*n);
	    }
	    public void setMin(int n) {
	    	//if n < max no problem 
	    	if(n <= this.getMax()) {
	    		this.min.setNum(n);
	    	} else {//min should be set to max and max to the new number 
	    		this.min.setNum(this.getMax());
	    		this.max.setNum(n);	
	    	}	
	    }
	    public void setMax(int n) {
	    	//if n < max no problem 
	    	if(n >= this.getMin()) {
	    		this.max.setNum(n);
	    	} else {//min should be set to max and max to the new number 
	    		this.max.setNum(this.getMin());
	    		this.min.setNum(n);	
	    	}	
	    }
	    
	    public MinMaxEven add(MinMaxEven M) {
	    	//needs to returns a MinMax object that is the sum of This and M
	    	//create a new Object
	    	MinMaxEven newObject = new MinMaxEven();
	    	newObject.min.setNum(this.getMin() + M.getMin());
	    	newObject.max.setNum(this.getMax() + M.getMax());
	    	return newObject;
	    	
	    	//in one single instruction 
	    	// return new MinMaxEven(this.getMin()+M.getMin(), this.getMax()+M.getMax()));
	    }
	    public boolean equals(MinMaxEven M) {
	    	if(this.min.equals(M.min) && this.max.equals(M.max)) {
	    		return true;
	    	}
	    	return false;
	    }

	
}
