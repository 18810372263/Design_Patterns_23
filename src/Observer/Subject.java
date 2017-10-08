package Observer;

public interface Subject {
	
	//增加观测者  
	public void add(Observer observer);
	
	// 删除观测者
	public void del(Observer observer);
	
	//通知所有观测者
	public void notifyObservers();
	
	//自身的操作
	public void operation();

}
