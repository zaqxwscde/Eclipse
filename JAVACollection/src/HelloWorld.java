public class HelloWorld {
    
    public static void main(String[] args) {
		// 创建对象，对象名为hello
		
        HelloWorld hello = new HelloWorld();
       
		// 调用方法
		 hello.showMyLove();
	}

	/*
	 * 定义无参无返回值的方法
	 */
	public void showMyLove() {
		System.out.println("我爱慕课网!");
	}
}