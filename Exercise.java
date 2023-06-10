//1.表示」、変数、演算
/* public class practice {
    public static void main ( String[] args )
    {
        System.out.println("HelloWorld");
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 13 ;

        System.out.println("x=" + x);
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;
        int y ;

        x = 13 ;
        y = 17 ;

        System.out.println( "x=" + x + ", y=" + y );
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 13 + 17;

        System.out.println( "x=" + x );
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 13 * 17;

        System.out.println( "x=" + x );
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 7 ;
        x = x * 3 ;
        System.out.println( "x=" + x );
        x = x / 2 ;
        System.out.println( "x=" + x );
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x, y, z ;

        x = 3 ;
        y = 7 ;

        z = x ;
        x = y ;
        y = z ;

        System.out.println("x=" + x + ",y=" + y ) ;
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x , y , z ;

        x = 19 ;
        y = 23 ;
        z = x * y ;

        System.out.println("z=" + z);
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 12 ;
        System.out.println(x * 2) ;
        System.out.println(x * 3) ;
        System.out.println(x * 4) ;
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 3 ;
        System.out.println(x) ;
        System.out.println(x * x) ;
        System.out.println(x * x * x) ;
    }
}
 */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 10 ;
        System.out.println("商=" + (x / 3) + ",余り=" + (x % 3)) ;
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x ;

        x = 10 ;
        System.out.println("商=" + (x / 3) + ",余り=" + (x % 3)) ;
    }
} */

/* public class practice{
    public static void main( String[] args )
    {
        int x = 10 ;

        //インクリメント演算子
        x ++ ;
        System.out.println(x) ;
        //デグリメント演算子(後置き)
        x -- ;
        x -- ;
        System.out.println(x) ;
    }
} */

//3.分岐
/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine()) ;
    int y = Integer.parseInt(br.readLine()) ;

    if( x > y)
        System.out.println("xはyより大きい。");
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine()) ;
    int y = Integer.parseInt(br.readLine()) ;

    if( x > y)
        System.out.println("大きいほうは、" + x );
    else
        System.out.println("大きいほうは、" + y );
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine()) ;
    int y = Integer.parseInt(br.readLine()) ;

    if( x > y)
        System.out.println("xはyより大きい");
    else if( y > x)
        System.out.println("xはyより小さい");
    else
    System.out.println("xとyは等しい");
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine()) ;

    if(( x % 2 ) == 0)
        System.out.println( x + "は偶数です");
    else
        System.out.println( x + "は奇数です");
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int x = Integer.parseInt(br.readLine()) ;

    if(( x % 2 ) == 0)
    {
        if(x >= 0)
        System.out.println( x + "は正の偶数です");
        else 
        System.out.println( x + "は負の偶数です");
    }
    else
    {
        if(x >= 0)
        System.out.println( x + "は正の奇数です");
        else 
        System.out.println( x + "は負の奇数です");
    }
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int s = Integer.parseInt(br.readLine()) ;

    if( s >= 90 )
        System.out.println("特優");
    else if( s >= 80 )
        System.out.println("優");
    else if( s >= 70 )
        System.out.println("良");
    else if( s >= 60 )
        System.out.println("可");
    else
        System.out.println("不可");
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int s = Integer.parseInt(br.readLine()) ;
    int s2 = Integer.parseInt(br.readLine()) ;

    if( s >= 60 && s2 >= 60)
        System.out.println("合格");
    else if( s + s2 >= 130 )
        System.out.println("合格");
    else if(( s + s2 >= 100 ) && ( s >= 90 || s2 >= 90 ))
        System.out.println("合格");
    else
        System.out.println("不合格");
    }
} */

// switch case
/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("何月ですか?");
    int month = Integer.parseInt(br.readLine()) ;
    
    switch(month)
    {
        case 1:
        System.out.println("元日");
        System.out.println("成人の日");
        break;
        case 2:
        System.out.println("建国記念日");
        break;
        case 3:
        System.out.println("春分の日");
        break;
        default:
        System.out.println("該当する月がありません。");
        break;
    }
    }
} */

// 4.繰り返し
/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {
    for( int i = 0 ; i < 10 ; i++ )
    System.out.println("SPAM");
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {
    for( int i = 1 ; i <= 9 ; i++ )
    System.out.println( 3 * i );
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {
    int x = 1;

    for( int n = 1 ; n <= 8 ; n ++ )
    {
    x = x * 2;
    System.out.println("2の" + n + "乗=" + x );
    }
    }
} */

// 7の階乗
/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {
    int x = 1;

    for( int i = 2 ; i <= 7 ; i ++ )
    x = x * i ;
    System.out.println(x);
    }
} */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in )) ;
    int sum = 0;

    for( int i = 0 ; i < 10 ; i ++ )
        {
        int val = Integer.parseInt(br.readLine()) ;
        sum += val ;
        }
        System.out.println("平均値は" + ( sum / 10 ));
    }
}   */

/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in )) ;
    int win = 0 ;

    for( int i = 0 ; i < 10 ; i ++ )
        {
        int result = Integer.parseInt(br.readLine()) ;
        if(result == 1)
        win += 1 ;
        }
        System.out.println("勝ち" + win + "回、負け" + (10 - win) + "回" );
    }
}   */

// 配列
/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    throws IOException
    {  
    BufferedReader br = new BufferedReader(new InputStreamReader( System.in )) ;
    int val[] = new int[10];

    for(int i = 0 ; i < 10 ; i ++ )
        val[i] = Integer.parseInt(br.readLine()) ;

    System.out.println();

    for(int i = 0 ; i < 10 ; i ++ )
        System.out.println(val[i] * 2);
    }
} */


/* import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    {
    System.out.println("4の2乗は" + pow2 (4) );
    }

    static int pow2(int n )
    {
        return n * n ;
    }
} */

import java.io.*;
public class Exercise
{
    public static void main ( String[] args )
    {
    System.out.println("4と9の平均は" + ave(5,9) );
    }

    static int ave(int x ,int y )
    {
        return (x + y) / 2 ;
    }
}
