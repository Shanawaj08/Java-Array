import java.util.*;
public class Main
{
    public String findTopology(int n, int m, int[] startPoint, int[] endPoint) {
        boolean ringTopology = false;
        boolean busTopology = false;
        boolean starTopology = false;
        int count = 0;
        boolean temp = false;
        for(int i=0; i<m; i++) {
            if((i!=m-1 && endPoint[i] == endPoint[i+1] && startPoint[i] != endPoint[i]) || starTopology == true ) {
                if(busTopology == true)
                    starTopology = false;
                else starTopology = true;
            }
            else if(endPoint[i] == startPoint[i]+1 || i==m-1) {
                if(i==m-1 && endPoint[i] == startPoint[0]) {
                    ringTopology = true;
                    busTopology = false;
                    count--;
                }
                //if(ringTopology == true) busTopology = false;
                else {
                    busTopology = true;
                    count++;
                }
            }
            
            
        }
        if(busTopology == true && count == m) {
            return "Given Topology is Bus Topology";
            
        }
        else if(ringTopology == true && count==m-2) {
            return "Given Topology is Ring Topology";
            
        }
        else if(starTopology == true) {
            return "Given Topology is Star Topology";
            
        }
        else {
            return "Invalid Topology";
            
        }
    }
    
	public static void main(String[] args) {
		Main mn = new Main();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of Nodes : ");
		int n = sc.nextInt();
		System.out.println("Enter No. of Connection : ");
		int m = sc.nextInt();
		int[] startPoint = new int[m];
		int[] endPoint = new int[m];
		for(int i=0; i<m; i++) {
		    System.out.println("Enter StartValue : ");
		    int startValue = sc.nextInt();
		    startPoint[i] = startValue;
		    System.out.println("Enter EndValue : ");
		    int endValue = sc.nextInt();
		    endPoint[i] = endValue;
		}
		System.out.println(Arrays.toString(startPoint));
		System.out.println(Arrays.toString(endPoint));
		System.out.println(mn.findTopology(n,m,startPoint,endPoint));
	}
}
