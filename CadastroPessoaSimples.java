import javax.swing.*;

public class CadastroPessoaSimples extends JFrame {

    private JPanel painel;

    public CadastroPessoaSimples() {
        super("Cadastro de Pessoa");
        inicializar();
    }

    public void inicializar() {
        painel = new JPanel();
        painel.setLayout(null);

        JLabel tipoLabel = new JLabel("Tipo:");
        tipoLabel.setBounds(20, 20, 50, 25);
        painel.add(tipoLabel);

        JComboBox<String> tipoCombo = new JComboBox<>(new String[]{"Física", "Jurídica"});
        tipoCombo.setBounds(70, 20, 100, 25);
        painel.add(tipoCombo);

        JLabel cpfLabel = new JLabel("CPF / CNPJ:");
        cpfLabel.setBounds(180, 20, 100, 25);
        painel.add(cpfLabel);

        JTextField cpfField = new JTextField();
        cpfField.setBounds(260, 20, 150, 25);
        painel.add(cpfField);

        JCheckBox fornecedorCheck = new JCheckBox("Fornecedor");
        fornecedorCheck.setBounds(420, 20, 120, 25);
        painel.add(fornecedorCheck);

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setBounds(20, 60, 100, 25);
        painel.add(nomeLabel);

        JTextField nomeField = new JTextField();
        nomeField.setBounds(70, 60, 470, 25);
        painel.add(nomeField);

        JLabel rgLabel = new JLabel("RG / Inscrição Estadual:");
        rgLabel.setBounds(20, 100, 160, 25);
        painel.add(rgLabel);

        JTextField rgField = new JTextField();
        rgField.setBounds(180, 100, 150, 25);
        painel.add(rgField);

        JLabel orgaoLabel = new JLabel("Órgão Expedidor:");
        orgaoLabel.setBounds(340, 100, 120, 25);
        painel.add(orgaoLabel);

        JTextField orgaoField = new JTextField();
        orgaoField.setBounds(460, 100, 80, 25);
        painel.add(orgaoField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 140, 50, 25);
        painel.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(70, 140, 200, 25);
        painel.add(emailField);

        JLabel cepLabel = new JLabel("CEP:");
        cepLabel.setBounds(280, 140, 40, 25);
        painel.add(cepLabel);

        JTextField cepField = new JTextField();
        cepField.setBounds(320, 140, 100, 25);
        painel.add(cepField);

        JLabel ufLabel = new JLabel("UF:");
        ufLabel.setBounds(430, 140, 30, 25);
        painel.add(ufLabel);

        JTextField ufField = new JTextField();
        ufField.setBounds(460, 140, 80, 25);
        painel.add(ufField);

        JLabel paisLabel = new JLabel("País:");
        paisLabel.setBounds(20, 180, 50, 25);
        painel.add(paisLabel);

        String[] paises = {
            "Afeganistão", "África do Sul", "Albânia", "Alemanha", "Andorra", "Angola", "Argentina",
            "Austrália", "Áustria", "Bahamas", "Bangladexe", "Barbados", "Bélgica", "Bolívia", "Brasil",
            "Canadá", "Chile", "China", "Colômbia", "Coreia do Sul", "Cuba", "Dinamarca", "Egito", "Emirados Árabes Unidos",
            "Equador", "Espanha", "Estados Unidos", "França", "Grécia", "Holanda", "Índia", "Indonésia", "Irã", "Irlanda",
            "Islândia", "Israel", "Itália", "Japão", "Líbano", "México", "Noruega", "Nova Zelândia", "Panamá",
            "Paraguai", "Peru", "Polônia", "Portugal", "Reino Unido", "República Dominicana", "Rússia", "Suécia",
            "Suíça", "Tailândia", "Turquia", "Ucrânia", "Uruguai", "Venezuela", "Vietnã", "Zimbábue"
        };
        JComboBox<String> paisCombo = new JComboBox<>(paises);
        paisCombo.setSelectedItem("Brasil");
        paisCombo.setBounds(70, 180, 200, 25);
        painel.add(paisCombo);

        JLabel municipioLabel = new JLabel("Município:");
        municipioLabel.setBounds(280, 180, 100, 25);
        painel.add(municipioLabel);

        JTextField municipioField = new JTextField();
        municipioField.setBounds(360, 180, 180, 25);
        painel.add(municipioField);

        JLabel logradouroLabel = new JLabel("Logradouro:");
        logradouroLabel.setBounds(20, 220, 100, 25);
        painel.add(logradouroLabel);

        JTextField logradouroField = new JTextField();
        logradouroField.setBounds(110, 220, 430, 25);
        painel.add(logradouroField);

        JLabel numeroLabel = new JLabel("Número:");
        numeroLabel.setBounds(20, 260, 80, 25);
        painel.add(numeroLabel);

        JTextField numeroField = new JTextField();
        numeroField.setBounds(90, 260, 100, 25);
        painel.add(numeroField);

        JLabel complementoLabel = new JLabel("Complemento:");
        complementoLabel.setBounds(200, 260, 100, 25);
        painel.add(complementoLabel);

        JTextField complementoField = new JTextField();
        complementoField.setBounds(300, 260, 240, 25);
        painel.add(complementoField);

        JLabel bairroLabel = new JLabel("Bairro:");
        bairroLabel.setBounds(20, 300, 50, 25);
        painel.add(bairroLabel);

        JTextField bairroField = new JTextField();
        bairroField.setBounds(70, 300, 200, 25);
        painel.add(bairroField);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneLabel.setBounds(280, 300, 80, 25);
        painel.add(telefoneLabel);

        JTextField telefoneField = new JTextField();
        telefoneField.setBounds(360, 300, 180, 25);
        painel.add(telefoneField);

        JLabel situacaoLabel = new JLabel("Situação:");
        situacaoLabel.setBounds(20, 340, 100, 25);
        painel.add(situacaoLabel);

        JRadioButton ativoRadio = new JRadioButton("Ativo", true);
        ativoRadio.setBounds(100, 340, 70, 25);
        painel.add(ativoRadio);

        JRadioButton inativoRadio = new JRadioButton("Inativo");
        inativoRadio.setBounds(180, 340, 80, 25);
        painel.add(inativoRadio);

        ButtonGroup situacaoGroup = new ButtonGroup();
        situacaoGroup.add(ativoRadio);
        situacaoGroup.add(inativoRadio);

        JButton confirmarButton = new JButton("Confirmar");
        confirmarButton.setBounds(70, 380, 100, 30);
        painel.add(confirmarButton);

        JButton excluirButton = new JButton("Excluir");
        excluirButton.setBounds(180, 380, 100, 30);
        painel.add(excluirButton);

        JButton limparButton = new JButton("Limpar");
        limparButton.setBounds(290, 380, 100, 30);
        painel.add(limparButton);

        this.setContentPane(painel);
        this.setSize(600, 470);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new CadastroPessoaSimples();
    }
}
