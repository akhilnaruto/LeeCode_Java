public int openLock(String[] deadends, String target) {
    for(String deadEnd : deadEnds){
        deadEnds.add(deadEnd);
    }
    
     
    if(target.equals("0000"))
        return -1;
        
    Queue<String> q =  new LinkedList();
    q.add("0000");
    q.add(null);
   
    
    int depth = 0; 
    while(!q.isEmpty()){
        String lockString =  q.poll();
         if(lockString == null){
            ++depth;
            if(q.peek() != null){
                q.add(null);
                continue;
            }
            else 
              return -1;
               
        }
        if(deadEnds.contains(lockString))
            continue;
        if(lockString == target)
            return depth;
        
        for(int i=0; i<4; i++){
            char tmp =  lockString.charAt(i);
            Integer curValue = Integer.parseInt(String.valueOf(tmp));
            Integer newValue =  curValue == 9 ? 0 : curValue+1;
            String newValue1 =  lockString.substring(0, i) + newValue.toString()
                                 + lockString.substring(i+1 , lockString.length());
            
            if(!visited.contains(newValue1)){
                q.add(newValue1);
                visited.add(newValue1);
            }
            
            Integer curValue2 =  curValue == 0 ? 9 : curValue -1;
            String newValue2 =  lockString.substring(0, i) + curValue2.toString()
                                 + lockString.substring(i+1 , lockString.length());
            
           if(!visited.contains(newValue2)){
                q.add(newValue2);
                visited.add(newValue2);
            }
            
        }
    }
    return depth;
    
}