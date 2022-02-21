package Ch7;

class MyTv {
   private boolean isPowerOn = false;
   private int channel;
   private int volume;
   private int prevChannel;

   final int MAX_VOLUME = 100;
   final int MIN_VOLUME = 0;
   final int MAX_CHANNEL = 100;
   final int MIN_CHANNEL = 1;

   // 알맞은 코드를 넣어 완성하시오

   public void turnOnOff() {
      if (isPowerOn == false) {
         isPowerOn = true;
      } else {
         isPowerOn = false;
      }
   }

   public void setChannel(int channel) {
      if (channel > MAX_CHANNEL || channel < MIN_CHANNEL)
         return;
      prevChannel = this.channel;
      this.channel = channel;
   }

   public int getChannel() {
      return channel;
   }

   public void setVolume(int volume) {
      if (volume > MAX_VOLUME || volume < MIN_VOLUME)
         return;
      this.volume = volume;
   }

   public int getVolume() {
      return volume;
   }

   void gotoPrevChannel() {
      setChannel(prevChannel);
   }

}

public class Ex7_4 {
   public static void main(String[] args) {
      MyTv t = new MyTv();

      t.setChannel(10);
      System.out.println("CH:" + t.getChannel());
      t.setChannel(20);
      System.out.println("CH:" + t.getChannel());
      t.gotoPrevChannel();
      System.out.println("CH:" + t.getChannel());
      t.gotoPrevChannel();
      System.out.println("CH:" + t.getChannel());

   }
}
