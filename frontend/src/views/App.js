import { BrowserRouter as Router, Route } from 'react-router-dom';
import MainTemplate from 'components/templates/MainTemplate';
import LoginPage from 'views/LoginPage';
import RegisterPage from 'views/RegisterPage';
import HomePage from './HomePage';
import ForgotPasswordPage from './ForgotPasswordPage';
import FavoritesPage from './FavoritesPage';

const App = () => {
  return (
    <Router>
      <MainTemplate>
        <Route path="/login">
          <LoginPage />
        </Route>
        <Route path="/register">
          <RegisterPage />
        </Route>
        <Route path="/forgot-password">
          <ForgotPasswordPage />
        </Route>
        <Route path="/favorites">
          <FavoritesPage />
        </Route>
        <Route path="/notifications">
          <p>notifications page</p>
        </Route>
        <Route path="/" exact>
          <HomePage />
        </Route>
      </MainTemplate>
    </Router>
  );
};

export default App;
