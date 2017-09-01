package br.cefetmg.games.collision;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Utilitário para verificação de colisão.
 *
 * @author fegemo <coutinho@decom.cefetmg.br>
 */
public class Collision {

    /**
     * Verifica se dois círculos em 2D estão colidindo.
     * @param c1 círculo 1
     * @param c2 círculo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean circlesOverlap(Circle c1, Circle c2) {
       
//     if( ((c1.x -c2.x)*(c1.x-c2.x) + (c1.y-c2.y)*(c1.x-c2.y)) < (c2.radius+c1.radius)*(c2.radius+c1.radius) ){
//         return true;
//     }
        float dst_center;
        float dst_radius;
        Vector2 cicle2;
        Vector2 cicle1;
        cicle1 = new Vector2(c1.x,c1.y);
        cicle2 = new Vector2(c2.x,c2.y);
        dst_center = cicle1.dst2(cicle2);
        dst_radius = (c2.radius+c1.radius)*(c2.radius+c1.radius);
        return dst_center<dst_radius;
    }

    /**
     * Verifica se dois retângulos em 2D estão colidindo.
     * Esta função pode verificar se o eixo X dos dois objetos está colidindo
     * e então se o mesmo ocorre com o eixo Y.
     * @param r1 retângulo 1
     * @param r2 retângulo 2
     * @return true se há colisão ou false, do contrário.
     */
    public static final boolean rectsOverlap(Rectangle r1, Rectangle r2) {
        if(((r1.x>r2.x) && (r1.x<(r2.x+r2.width)))&&((r1.y>r2.y) && (r1.y<(r2.y+r2.height)))) 
            return true;
        return false;
    }

    private static float dst2(Vector2 dist) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

