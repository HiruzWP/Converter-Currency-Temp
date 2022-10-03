import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		//Chamadas das classes
		CurrencyConverter converter = new CurrencyConverter();
		TemperatureConverter converterTemp = new TemperatureConverter();
		
		while(true) {
			
			String opt = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Conversor de Moeda", "Conversor de Temperatura"}, "Escolha").toString();
			
			switch(opt) {
			
				case "Conversor de Moeda":
					
					String optMoeda = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]
							{"Real para Dolar", 
							"Real para Euro", 
							"Real para Libra Esterlina", 
							"Real para Peso Argentino", 
							"Real para Peso Chileno", 
							"Dolar para Real", 
							"Euro para Real", 
							"Libra Esterlina para Real", 
							"Peso Argentino para Real", 
							"Peso Chileno para Real"}, "Escolha").toString();
					
					switch(optMoeda) {
					
						case "Real para Dolar":
							String inputDollar = JOptionPane.showInputDialog("Insira um valor em Real");
							converter.ConverterRealToDollar(inputDollar);
							break;
						
						case "Real para Euro":
							String inputEuro = JOptionPane.showInputDialog("Insira um valor em Real");
							converter.ConverterRealToEuro(inputEuro);
							break;
							
						case "Real para Libra Esterlina":
							String inputLibraE = JOptionPane.showInputDialog("Insira um valor em Real");
							converter.ConverterRealToPoundSterling(inputLibraE);
							break;
						case "Real para Peso Argentino":
							String inputPesoAr = JOptionPane.showInputDialog("Insira um valor em Real");
							converter.ConverterRealToArg(inputPesoAr);
							break;
						case "Real para Peso Chileno":
							String inputPesoCh = JOptionPane.showInputDialog("Insira um valor em Real");
							converter.ConverterRealToCh(inputPesoCh);
							break;
						case "Dolar para Real":
							String inputRealDollar = JOptionPane.showInputDialog("Insira um valor em Dólar");
							converter.ConverterDolarToReal(inputRealDollar);
							break;
						case "Euro para Real":
							String inputRealEuro = JOptionPane.showInputDialog("Insira um valor em Euro");
							converter.ConverterEuroToReal(inputRealEuro);
							break;
						case "Libra Esterlina para Real":
							String inputRealLibraE = JOptionPane.showInputDialog("Insira um valor em Libra Estrelina");
							converter.ConverterLibraEToReal(inputRealLibraE);
							break;
						case "Peso Argentino para Real":
							String inputRealPesoArg = JOptionPane.showInputDialog("Insira um valor em Peso Argentino");
							converter.ConverterPesoArgToReal(inputRealPesoArg);
							break;
						case "Peso Chileno para Real":
							String inputRealPesoCh = JOptionPane.showInputDialog("Insira um valor em Peso Chileno");
							converter.ConverterPesoChToReal(inputRealPesoCh);
							break;
					}
					
					break;
				
				case "Conversor de Temperatura":
					
					String optTemp = JOptionPane.showInputDialog(null, "Escolha uma opção", "Menu", JOptionPane.PLAIN_MESSAGE, null, new Object[]
							{"Celsius para Fahrenheit", 
							"Celsius para Kelvin", 
							"Fahrenheit para Celsius", 
							"Kelvin para Celsius"}, "Escolha").toString();
					
					switch(optTemp) {
					
						case "Celsius para Fahrenheit":
							String inputCelsiusFah = JOptionPane.showInputDialog("Insira uma temperatura em Celsius");
							converterTemp.ConverterCelsiusToFahrenheit(inputCelsiusFah);
							break;
					
						case "Celsius para Kelvin":
							String inputCelsiusKel = JOptionPane.showInputDialog("Insira uma temperatura em Celsius");
							converterTemp.ConverterCelsiusToKelvin(inputCelsiusKel);
							break;
						case "Fahrenheit para Celsius":
							String inputFahCelsius = JOptionPane.showInputDialog("Insira uma temperatura em Fahrenheit");
							converterTemp.ConverterFahrenheitToCelsius(inputFahCelsius);
							break;
						case "Kelvin para Celsius":
							String inputKelCelsius = JOptionPane.showInputDialog("Insira uma temperatura em Kelvin");
							converterTemp.ConverterKelvinToCelsius(inputKelCelsius);
							break;
					}
					
					break;
				
					
			
			}
			
		}
		
		

	}

}
