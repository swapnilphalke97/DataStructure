giventext="ABABDABACDABABCABAB"
pattern="ABABCABAB"


lap=[1]*20
inu=0
po=0


for i in range(1,len(pattern)-1):
    j=0
    inu=i
    count=0
    while pattern[j]==pattern[inu]:
        if inu!=len(pattern)-1:
            j=j+1
            inu=inu+1
            count=count+1
        else:
            break
        
        
        
       
   
    lap[i+count]=i
    print(lap)
    
k=0  
while k<len(giventext)-1:
    po=k
    j=0
    count=0
    while giventext[po]==pattern[j]:
              
              j=j+1
              po=po+1
              count=count+1
              
              if count==8:
                  print("match is there")
                  break
                  print("whynot?")
   
   
    if count!=8:
         k=k+lap[count-1]
    else:
        break
    

                
                


  
            
       
         


    

    

        
     
    

      