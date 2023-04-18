package hello.core.order;

public class SingleToneService {
	private SingleToneService() {
	}
	
	public static final SingleToneService instance = new SingleToneService();
	
	public static SingleToneService getInstance() {
		System.out.println(instance);
		return instance;
	}
	
	public void logic() {
		System.out.println("싱글톤 객체 로직호출");
	}
	
}
