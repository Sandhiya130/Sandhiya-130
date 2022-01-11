num=[   
    [1, 0, 0],  
    [0, 1, 0],  
    [0, 0, 1]  
];  

function dentity(num)
{
  for (i in num)
    {    
    if (num[i][i]!=1)
           {
             return false;
           }
    }
return true;
    
}
