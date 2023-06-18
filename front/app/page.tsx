"use client";

import { DeviceCard } from "@/components/DeviceCard";
import { DeviceControl } from "@/components/DeviceControl";
import { DeviceList } from "@/components/DeviceList";
import { UnitControl } from "@/components/UnitControl";
import Image from "next/image";
import { useState } from "react";

export default function Home() {
  const [currentDevice, setCurrentDevice] = useState<number>();

  return (
    <main className="container mx-auto p-4">
      <div className="flex flex-col gap-6">
        <DeviceControl
          currentDevice={currentDevice}
          setCurrentDevice={setCurrentDevice}
        />
        <UnitControl
          currentDevice={currentDevice}
          setCurrentDevice={setCurrentDevice}
        />
      </div>
    </main>
  );
}
