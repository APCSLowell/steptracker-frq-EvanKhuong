import java.util.ArrayList;
public class StepTracker
{
 private int a, s;
 private int d, aD;
 
 public StepTracker(int steps){
  a=steps;
  s=0;
  d=0;
  aD=0;
 }

 public void addDailySteps(int x){
  s+=x;
  d++;
  if (x>=a)
   aD++;
 }
 
 public int activeDays(){
  return aD;
 }
 
 public double averageSteps(){
  if (d==0)
   return 0.0;
  else return (double) s/d;
 }
 
} 
