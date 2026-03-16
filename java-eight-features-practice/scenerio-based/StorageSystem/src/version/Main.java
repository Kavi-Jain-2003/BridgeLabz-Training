package version;

import java.util.*;

class FileOp {
    String filename;
    String version;
    int fileSize;

    FileOp(String filename, String version, int fileSize) {
        this.filename = filename;
        this.version = version;
        this.fileSize = fileSize;
    }

    public int getFileSize() {
        return fileSize;
    }

    public String getVersion() {
        return version;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, List<FileOp>> map = new HashMap<>();

        for(int i=0;i<n;i++)
        {
            String input = sc.nextLine();
            String[] split = input.split(" ");

            String operation = split[0];

            if(operation.equals("UPLOAD"))
            {
                String fileName = split[1];
                String version = split[2];
                int size = Integer.parseInt(split[3]);

                map.putIfAbsent(fileName,new ArrayList<>());

                List<FileOp> list = map.get(fileName);

                boolean exists=false;

                for(FileOp f:list)
                {
                    if(f.version.equals(version))
                    {
                        exists=true;
                        break;
                    }
                }

                if(!exists)
                {
                    list.add(new FileOp(fileName,version,size));
                }
            }

            else if(operation.equals("FETCH"))
            {
                String fileName = split[1];

                if(!map.containsKey(fileName))
                {
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileOp> list = new ArrayList<>(map.get(fileName));

                Collections.sort(list,(a,b)->{
                    if(a.fileSize!=b.fileSize)
                        return a.fileSize-b.fileSize;
                    return a.version.compareTo(b.version);
                });

                for(FileOp f:list)
                {
                    System.out.println(fileName+" "+f.version+" "+f.fileSize);
                }
            }

            else if(operation.equals("LATEST"))
            {
                String fileName = split[1];

                if(!map.containsKey(fileName))
                {
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileOp> list = map.get(fileName);

                FileOp latest = list.get(list.size()-1);

                System.out.println(fileName+" "+latest.version+" "+latest.fileSize);
            }

            else if(operation.equals("TOTAL_STORAGE"))
            {
                String fileName = split[1];

                if(!map.containsKey(fileName))
                {
                    System.out.println("File Not Found");
                    continue;
                }

                int total=0;

                for(FileOp f:map.get(fileName))
                {
                    total+=f.fileSize;
                }

                System.out.println(fileName+" "+total);
            }
        }

        sc.close();
    }
}
