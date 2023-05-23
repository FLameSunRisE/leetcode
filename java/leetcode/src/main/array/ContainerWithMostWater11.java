package main.array;

/**
 * ContainerWithMostWater11.
 *
 * @author jayyeh
 * @version 1.0.0
 * @date 2023/05/23
 */
public class ContainerWithMostWater11 {

  public int maxArea(int[] height) {
        return this.maxArea_first(height);
//    return this.maxArea_github_copilot(height);
  }

  /**
   * maxArea_first.
   * time complexity: O(n)
   * space complexity: O(1)
   *
   * @param height
   * @return int
   */
  private int maxArea_first(int[] height) {
    if (height.length == 2) {
      return Math.min(height[0], height[1]);
    }
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int area = (right - left) * Math.min(height[left], height[right]);
      maxArea = Math.max(maxArea, area);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }

  private int maxArea_github_copilot(int[] height) {
    int maxArea = 0;
    int left = 0;
    int right = height.length - 1;
    while (left < right) {
      int area = (right - left) * Math.min(height[left], height[right]);
      maxArea = Math.max(maxArea, area);
      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }
    return maxArea;
  }

}
