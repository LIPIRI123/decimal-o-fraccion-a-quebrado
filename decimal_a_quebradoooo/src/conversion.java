/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author lipiri
 */
public class conversion {
      public static void main(String[]org)
    {
        Scanner l=new Scanner(System.in);
        String n=l.next();
        String m[]=n.split(",");
        char v[]=m[1].toCharArray();
        char v1[]=m[1].toCharArray();
        for(int i=0;i<v.length;i++){
            int c=0;
            //mmmmmmm
            if(v[i]!='m'){
                
            for(int j=i+1;j<v.length;j++){
                if(v[i]==v[j]&&v[j]!='m'){
                    c++;
                    v[j]='m';
                }
            }
            if(c>=1){
                v[i]='m';
            }
        }
        }//7.44787777412
            int c1=0,c2=0,y=0,c7=0;
            for(int i=0;i<v.length;i++){
                if(v[i]!='m'){
                    c2++;
                }
                if(v[i]=='m'){
                    y=i;
                    break;
                }
            }
            int compro=0;
            if(y>0||c2==0)
            {
                for(int i=y;i<v.length;i++){
                    if(v[i]=='m'){
                        c1++;
                    }else{
                        compro++;
                    }
                }
            }
            String p1="",p2="",nueve="";
            int s1=1,s2=0;int k1=0,k2=0;
            if(c1==v.length){
                //pura
                //7,18181818181
                for(int i=0;i<v.length;i++){
                    p1="";p2="";
                    for(int j=0;j<s1;j++){
                    p1+=v1[j];
                    }//77777
                    s2=s1;
                    for(int j=s1;j<(s2+s2);j++){
                        p2+=v1[j];
                    }
                    if(p1.equals(p2)){
                        break;
                    }s1++;
                }
                //System.out.println(p1+"  "+p2);
                
                for(int i=0;i<p1.length();i++){
                    nueve+="9";
                }
                    k1=Integer.parseInt(nueve)*Integer.parseInt(m[0]);
                    k2=Integer.parseInt(nueve)/Integer.parseInt(nueve)*Integer.parseInt(p1);
                    int arriba=k1+k2;
                    int abajo=Integer.parseInt(nueve);
                    //System.out.println(arriba+"/"+abajo);
                    for(int i=2;i<abajo;i++){
                        if(arriba%i==0&&abajo%i==0){
                            arriba/=i;abajo/=i;
                            i=2;
                        }
                    }
                    System.out.println(arriba+"/"+abajo);
            }else{//7,78454545454
                if(c1>c2&&compro==0){
                    //7845 45 4 5 78mmmmmm
                    s1=y+1;//y=2 s1=4
                    int d=1;//d=2;
                    for(int i=0;i<v.length;i++){
                    p1="";p2="";
                    for(int j=y;j<s1;j++){
                    p1+=v1[j];//45
                    }//77777
                    s2=s1;//s2=4+d=6
                    for(int j=s1;j<(s2+d);j++){
                        p2+=v1[j];//45
                    }
                    if(p1.equals(p2)){
                        break;
                    }s1++;d++;
                }
                        String numero="";
                    for(int j=0;j<p1.length();j++){
                        nueve+="9";
                        
                    }
                    for(int j=0;j<y;j++){
                        nueve+="0";
                        numero+=v1[j];
                     }
                    //System.out.println(numero+""+p1);
                    int arriba=Integer.parseInt(numero+p1)-Integer.parseInt(numero);
                    int abajo=Integer.parseInt(nueve);
                    for(int i=2;i<abajo;i++){
                        if(arriba%i==0&&abajo%i==0){
                            arriba/=i;abajo/=i;
                            i=2;
                        }
                    }
                    k1=abajo*Integer.parseInt(m[0]);
                    k2=abajo/abajo*arriba;
                    System.out.println((k1+k2)+"/"+abajo);
                }
            
            
            else{
                    if(v.length<9){
                        
                    //exacta
                    int dec=Integer.parseInt(m[1]);
                    int de=m[1].length();
                    int ele=(int)(Math.pow(10, de));
                    
                    k1=ele*Integer.parseInt(m[0]);
                    k2=ele/ele*dec;
                    int arriba=k1+k2;
                     for(int i=2;i<ele;i++){
                        if(arriba%i==0&&ele%i==0){
                            arriba/=i;ele/=i;
                            i=2;
                        }
                    }
                     System.out.println(arriba+"/"+ele);
                }else{
                    System.out.println("muchos digitos");
                    }
                
                }
                    
        
            }
    }
}