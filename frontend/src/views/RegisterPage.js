import AuthTemplate from 'components/templates/AuthTemplate';
import Input from 'components/Input/Input';
import Heading from 'components/Heading/Heading';
import Text from 'components/Text/Text';
import StyledLink from 'components/StyledLink/StyledLink';
import SocialAuthButton from 'components/SocialAuthButton/SocialAuthButton';
import googleIcon from 'assets/images/social/google-icon.svg';
import facebookIcon from 'assets/images/social/facebook-icon.svg';
import Button from 'components/Button/Button';

const RegisterPage = () => {
  return (
    <AuthTemplate>
      <Heading>Zarejestruj się</Heading>
      <Text>
        Masz już konto? <StyledLink to="/login">Zaloguj się</StyledLink>
      </Text>

      <SocialAuthButton socialIcon={googleIcon} socialName="Google">
        Zarejestruj się przez Google
      </SocialAuthButton>
      <SocialAuthButton socialIcon={facebookIcon} socialName="Google">
        Zarejestruj się przez Facebook
      </SocialAuthButton>
      <Input />
      <Input name="Hasło" type="password" placeholder="Utwórz hasło" />
      <Input name="Powtórz hasło" type="password" placeholder="Powtórz hasło" />
      <Button>Zarejestruj się</Button>
    </AuthTemplate>
  );
};

export default RegisterPage;
