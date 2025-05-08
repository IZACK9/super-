@RestController
@RequestMapping("/api/shape")
public class ShapeController {

    private Shape shape = new Shape(100, 100, 50, 50);

    @GetMapping
    public Shape getShape() {
        return shape;
    }

    @PostMapping
    public Shape updateShape(@RequestBody Shape newShape) {
        this.shape = newShape;
        return shape;
    }
}

class Shape {
    private int x, y, width, height;

    // コンストラクタとゲッター・セッター
    public Shape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Getter and Setter
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }
}