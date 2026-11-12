package eu1_ka.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Mail 
@Interceptor
@Priority (10)
public class MailService {


     @AroundInvoke
    public Object enviarSms(InvocationContext context) throws Exception {

        System.out.println("[Mail] ANTES: preparando envio de SMS...");

        Object resultado = context.proceed();
        //Pedido pedido = (Pedido) context.getParameters()[0];
        //System.out.println("[Sms] DESPUES: Enviando SMS al telefono: " + pedido.getTelefono());
        //System.out.println("[Sms] Mensaje: Su pedido de " + pedido.getProducto() + " fue confirmado");
        System.out.println("[Mail] SMS enviado con exito");

        return resultado;
    }
    
}
