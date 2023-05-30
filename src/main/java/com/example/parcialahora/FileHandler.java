package com.example.parcialahora;

import java.io.*;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class FileHandler {

    public static void leerArchivoNomina( Nomina n, String fileName) {

        try {
            String nombre;
            int id;
            String dependencia;
            String cargo;
            int numeroSalarios;
            String escalafon;
            double valorHora = 1.0;
            Escalafon es;
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();

            while (!line.equals("FIN")) {
                String datosEmpleado = line;
                StringTokenizer stringTokenizer = new StringTokenizer(datosEmpleado, "%");

                nombre = stringTokenizer.nextToken().trim();
                id = Integer.parseInt(stringTokenizer.nextToken().trim());
                cargo = stringTokenizer.nextToken().trim();

                StringTokenizer stringTokenizer1;
                line = bufferedReader.readLine();
                String auxLine = "";
                while (!line.equals("#")) {
                    stringTokenizer1 = new StringTokenizer(line, "\n");
                    switch (cargo) {
                        case "Empleado" -> {
                            numeroSalarios = Integer.parseInt(stringTokenizer1.nextToken().trim());
                            dependencia = "dep";
                            auxLine = bufferedReader.readLine();
                            n.agregarPersona(nombre, id, numeroSalarios, dependencia, cargo);
                        }
                        case "Monitor" -> {
                            numeroSalarios = 0;
                            dependencia = "dep";
                            n.agregarPersona(nombre, id, numeroSalarios, dependencia, cargo, valorHora);
                            auxLine = line;
                            while (!auxLine.equals("#")) {
                                StringTokenizer stringTokenizer2 = new StringTokenizer(auxLine, ",");
                                String nombreAsignatura = stringTokenizer2.nextToken().trim();
                                int numHoras = Integer.parseInt(stringTokenizer2.nextToken().trim());
                                ((Monitor) n.getPersonas().get(n.getPersonas().size() - 1)).
                                        agregarAsignatura(numHoras, nombreAsignatura);
                                auxLine = bufferedReader.readLine();
                            }
                        }
                        case "Profesor" -> {
                            escalafon = stringTokenizer1.nextToken().trim();
                            es = Enum.valueOf(Escalafon.class, escalafon.toUpperCase());
                            numeroSalarios = es.getSalario();
                            dependencia = "dep";
                            n.agregarPersona(nombre, id, numeroSalarios, dependencia, cargo, valorHora, es);
                            auxLine = bufferedReader.readLine();
                            while (!auxLine.equals("#")) {
                                StringTokenizer stringTokenizer2 = new StringTokenizer(auxLine, ",");
                                String nombreAsignatura = stringTokenizer2.nextToken().trim();
                                int numHoras = Integer.parseInt(stringTokenizer2.nextToken().trim());
                                ((Profesor) n.getPersonas().get(n.getPersonas().size() - 1)).
                                        agregarAsignatura(numHoras, nombreAsignatura);
                                auxLine = bufferedReader.readLine();
                            }
                        }

                    }//fin if token2
                    line = auxLine;
                }//fin while
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String escribirArchivoReporte(Nomina n) throws IOException {
        String fileName = "Reporte.txt";
        FileWriter fw = new FileWriter(fileName);
        for (Persona p: n.getPersonas())
            fw.write(p.getNombre() + " , " + p.getNumeroIdentificacion() + " , \\$ " + Nomina.calcularSalarioPersona(p) + "\n");

        fw.close();
        return Paths.get("Reporte.txt").toString();
    }
}