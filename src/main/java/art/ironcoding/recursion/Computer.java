package art.ironcoding.recursion;

import java.util.stream.Stream;

public class Computer {

    public static void main(String[] args) {
        Component pc = new Component("Gabinete PC");
        Component powerFount = new Component("Font 700");
        Component motherPlack = new Component("MainBoard Azus");
        Component cpu = new Component("Amd raizen 5");
        Component fan = new Component("Cpu fan");
        Component disipator = new Component("Dicipador");
        Component videoBoard = new Component("Video Nvidea");
        Component gpu = new Component("Nvida Gpu RTX");
        Component gpuRam1 = new Component("4 gb");
        Component gpuRam2 = new Component("4 gb");
        Component fanes = new Component("Fans");
        Component ram = new Component("Ram Memory 32 GB");
        Component disk = new Component("Hard Disk");

        cpu.addSon(fan)
                .addSon(disipator);

        videoBoard.addSon(gpu)
                .addSon(gpuRam1)
                .addSon(gpuRam2)
                .addSon(fanes);

        motherPlack.addSon(cpu)
                .addSon(videoBoard)
                .addSon(ram)
                .addSon(disk);

        pc.addSon(powerFount)
                .addSon(motherPlack)
                .addSon(new Component("KeyBoard"))
                .addSon(new Component("Mouse"));

        // recursionJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getLevel()) + c.getName()));

        recursion(pc, 0);
    }

    public static void recursion(Component component, int level) {
        System.out.println("\t".repeat(level) + "component.getName() = " + component.getName());

        if (component.hasSon()) {
            for (Component hijo : component.getSons()) {
                recursion(hijo, level + 1);
            }
        }

    }

    public static Stream<Component> recursionJava8(Component component, int level) {
        component.setLevel(level);
        return Stream.concat(Stream.of(component),
                component.getSons().stream().flatMap(hijo -> recursionJava8(hijo, level + 1)));
    }


}
