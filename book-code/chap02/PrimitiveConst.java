

public class PrimitiveConst{
	public static void main(String[] args){
		System.out.println("byte类型最大值:" + Byte.MAX_VALUE +
							"; byte类型最小值:" + Byte.MIN_VALUE);
		System.out.println("short类型最大值:" + Short.MAX_VALUE + 
							"; short类型最小值:" + Short.MIN_VALUE);
		System.out.println("int类型最大值:" + Integer.MAX_VALUE + 
							"; int类型最小值:" + Integer.MIN_VALUE);
		System.out.println("long类型最大值:" + Long.MAX_VALUE +
							"; long类型最小值:" + Long.MIN_VALUE);
		System.out.println("float类型最大值:" + Float.MAX_VALUE +
							"; float类型最小值:" + Float.MIN_VALUE);
		System.out.println("double类型最大值:" + Double.MAX_VALUE +
							"; double类型最小值:" + Double.MIN_VALUE);
		System.out.println("float类型正无穷大值:" + Float.POSITIVE_INFINITY +
							"; float类型负无穷大值:" + Float.NEGATIVE_INFINITY);
		System.out.println("double类型正无穷大值:" + Double.POSITIVE_INFINITY +
							"; double类型负无穷大值:" + Double.NEGATIVE_INFINITY);
		System.out.println("float类型非法数的值:" + Float.NaN);
		System.out.println("double类型非法数的值:" + Double.NaN);
	}
}