class Solution {
    public double average(int[] salary) {
      
      double sum=0;
      int maxSalary = Integer.MIN_VALUE;
      int minSalary = Integer.MAX_VALUE;
      for(int sal:salary) {
        sum+=sal;
        if (sal>maxSalary) maxSalary=sal;
        if(sal<minSalary) minSalary=sal;
      }
      sum-=maxSalary;
      sum-=minSalary;    
      return (double) sum/(salary.length-2);
    }
}
