# Aula 03, 04 e 05

Cobertura de Código

![Alt text](report/cobertura/report.png "Cobertura")

Testes de Mutação

java -cp bin/:lib/* org.pitest.mutationtest.commandline.MutationCoverageReport --reportDir report/mutacao --targetClasses br.* --targetTests br.* --sourceDirs src/* --excludedClasses *Test*

![Alt text](report/mutacao/201908051620/mutacao.png "Cobertura")

URL: report/mutacao/201908051620