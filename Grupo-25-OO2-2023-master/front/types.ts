type Themes = "light" | "dark";
type DeviceNames = "Parking" | "Light" | "Trash" | "Watering";
type Icon = ({ theme }: { theme: Themes }) => JSX.Element;
type NameToIcon = Record<DeviceNames, Icon>;

type DeviceProps = {
  id: number;
  name: DeviceNames;
  status: string;
};

type UnitProps = {
  id: number;
  name: string;
  status: string;
};

type EventProps = {
  id: number;
  description: string;
};
