// m & n is sizee of ar1 and ar2
//i and j are two pointers, intialise to 0;
//So count is just going to median, and storing that in m1 and return
// if (m + n) % 2 == 1, we need to take m1 and next median avg, so take m1 and m2

if ((m + n) % 2 == 1)
    {
        for(count = 0;
            count <= (n + m) / 2;
            count++)
        {
            if (i != n && j != m)
            {
              //import past of algo
                m1 = (ar1[i] > ar2[j]) ?
                      ar2[j++] : ar1[i++];
            }
            else if (i < n)
            {
                m1 = ar1[i++];
            }
             
       else
            {
                m1 = ar2[j++];
            }
        }
        return m1;
    }
