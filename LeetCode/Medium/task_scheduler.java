class Solution 
{
    public int leastInterval(char[] tasks, int n) 
    {
        int count[] = new int[26];
        for(char task: tasks)
        {
            count[task-'A']++;
        }

        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int cnt : count)
        {
            if(cnt > 0)
            {
                maxheap.add(cnt);
            }
        }

        int time = 0;
        Queue<int[]> q = new LinkedList<>();
        while (!maxheap.isEmpty() || !q.isEmpty()) 
        {
            time++;
            
            if (maxheap.isEmpty()) 
            {
                time = q.peek()[1];
            } 
            else 
            {
                int cnt = maxheap.poll() - 1;
                if (cnt > 0) 
                {
                    q.add(new int[]{cnt, time + n});
                }
            }

            if (!q.isEmpty() && q.peek()[1] == time) 
            {
                maxheap.add(q.poll()[0]);
            }
        }
        return time;
    }
}

/*
621. Task Scheduler

You are given an array of CPU tasks, each labeled with a letter from A to Z, and a number n. 
Each CPU interval can be idle or allow the completion of one task. 
Tasks can be completed in any order, but there's a constraint: there has to be a gap of at least n intervals between two tasks with the same label.

Return the minimum number of CPU intervals required to complete all tasks.

Example 1:
Input: tasks = ["A","A","A","B","B","B"], n = 2
Output: 8

Explanation: A possible sequence is: A -> B -> idle -> A -> B -> idle -> A -> B.
After completing task A, you must wait two intervals before doing A again. 
The same applies to task B. In the 3rd interval, neither A nor B can be done, so you idle. 
By the 4th interval, you can do A again as 2 intervals have passed.

Example 2:
Input: tasks = ["A","C","A","B","D","B"], n = 1
Output: 6

Explanation: A possible sequence is: A -> B -> C -> D -> A -> B.
With a cooling interval of 1, you can repeat a task after just one other task.

Example 3:
Input: tasks = ["A","A","A", "B","B","B"], n = 3
Output: 10

Explanation: A possible sequence is: A -> B -> idle -> idle -> A -> B -> idle -> idle -> A -> B.
There are only two types of tasks, A and B, which need to be separated by 3 intervals. 
This leads to idling twice between repetitions of these tasks. 
*/