# SimpleGreeterEAR
creates EAR for easy deploy of EJB



usage on localhost:


thufir@doge:~/NetBeansProjects/corba$ 
thufir@doge:~/NetBeansProjects/corba$ ll
total 24
drwxrwxr-x  6 thufir thufir 4096 Mar 11 03:34 ./
drwxrwxr-x 20 thufir thufir 4096 Mar 11 03:07 ../
drwxrwxr-x  7 thufir thufir 4096 Mar 11 03:25 GreeterCorbaClient/
drwxrwxr-x  8 thufir thufir 4096 Mar 11 03:03 GreeterEJB/
drwxrwxr-x  7 thufir thufir 4096 Mar 11 03:35 GreeterLibrary/
drwxrwxr-x  8 thufir thufir 4096 Mar 11 03:35 SimpleGreeterEAR/
thufir@doge:~/NetBeansProjects/corba$ 
thufir@doge:~/NetBeansProjects/corba$ asadmin deploy SimpleGreeterEAR/dist/SimpleGreeterEAR.ear 
Application deployed with name SimpleGreeterEAR.
Command deploy executed successfully.
thufir@doge:~/NetBeansProjects/corba$ 
thufir@doge:~/NetBeansProjects/corba$ appclient -client GreeterCorbaClient/dist/GreeterCorbaClient.jar 
{org.omg.CORBA.ORBInitialPort=3700, java.naming.factory.initial=com.sun.enterprise.naming.impl.SerialInitContextFactory, Context.SECURITY_CREDENTIALS=pass123, org.omg.CORBA.ORBInitialHost=localhost, java.naming.factory.url.pkgs=com.sun.enterprise.naming, java.naming.factory.state=com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl, Context.SECURITY_PRINCIPAL=user1}
[fred, flinstone, barney, rubble, wilma]
thufir@doge:~/NetBeansProjects/corba$ 
