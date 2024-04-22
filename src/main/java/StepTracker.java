import java.util.ArrayList;
public class StepTracker
{
 private int a, s, aD, d;
 
 public StepTracker(int steps){
  a=steps;
  s=0;
  aD=0;
  d=0;
 }

 public void addDailySteps(int x){
  s+=x;
  tD++;
  if (s>a)
   d++;
 }
 
 public int activeDays(){
  return d;
 }
 
 public double averageSteps(){
  if (d==0)
   return 0.0;
  return (double) s/d;
 }
 
} 
