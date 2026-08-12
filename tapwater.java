import java.util.Arrays;

public class tapwater {
  public static void trappedRainwater(int height[]){
   //calculate left max boundry

   int leftMax[]=new int[height.length];
   leftMax[0]=height[0];
   for(int i=1;i<height.length;i++){
       leftMax[i]=Math.max(height[i], leftMax[i-1]); 
   }
   //calculate right max boundry
   int rightMax[]=new int[height.length];
   rightMax[height.length-1]=height[height.length-1];
   for(int i=height.length-2;i>=0;i--){
      rightMax[i]=Math.max(height[i], rightMax[i+1]);
   }
   //loop
   //waterlevel=min(leftmaxboundary,rightmaxboundry)

   int waterLevel[]=new int[height.length];

   for(int i=0;i<height.length;i++){
     waterLevel[i]=Math.min(rightMax[i],leftMax[i]);
   }
 //trappedwater=(waterlevel-height)*width
   int holdWater[]=new int[height.length];
   int totalTrap=0;
   for(int i=0;i<height.length;i++){
    holdWater[i]=waterLevel[i]-height[i];
    totalTrap+=holdWater[i];
   }
   System.out.println(Arrays.toString(holdWater));
   System.out.println(totalTrap);
  }
  public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    trappedRainwater(height);
    
  }
}
